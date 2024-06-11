package pro.sky;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.Exception.ValidationFailedException;

@Service
public class ValidationService {
    public String validateCheckName(String name) {
        if (!StringUtils.isAlpha(name)) {
            throw new ValidationFailedException();
        }
        return StringUtils.capitalize(name.toLowerCase());
    }
}
