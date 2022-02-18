/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.test.constraints;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author Hardy Ferentschik
 */
public class ObjectConstraintValidator implements ConstraintValidator<org.hibernate.validator.test.constraints.Object, java.lang.Object> {

	@Override
	public boolean isValid(java.lang.Object value, ConstraintValidatorContext constraintValidatorContext) {
		return true;
	}
}
