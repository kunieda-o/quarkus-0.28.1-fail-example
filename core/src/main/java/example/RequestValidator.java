package example;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import java.util.Set;

@ApplicationScoped
@Slf4j
public class RequestValidator {

    @Inject
    Validator validator;

    public <T> void validate(T object) {
        Set<ConstraintViolation<T>> res = validator.validate(object);
        if (res.isEmpty()) {
            return;
        }
        throw new ConstraintViolationException(res);
    }
}
