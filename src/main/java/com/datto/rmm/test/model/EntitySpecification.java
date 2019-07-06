package com.datto.rmm.test.model;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

public class EntitySpecification {

	public static Specification<Device> textInAllColumns(String text) {

		if (!text.contains("%")) {
			text = "%" + text + "%";
		}
		final String finalText = text;

		return new Specification<Device>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 5733103005071373465L;

			@Override
			public Predicate toPredicate(Root<Device> root, CriteriaQuery<?> cq, CriteriaBuilder builder) {
				return builder.or(root.getModel().getDeclaredSingularAttributes().stream().filter(a -> {
					if (a.getJavaType().getSimpleName().equalsIgnoreCase("string")) {
						return true;
					} else {
						return false;
					}
				}).map(a -> builder.like(root.get(a.getName()), finalText)).toArray(Predicate[]::new));
			}

		
		};
	}

}