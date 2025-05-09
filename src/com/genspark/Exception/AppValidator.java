package com.genspark.Exception;

import com.genspark.Exception.exception.AppSizeTooLargeException;
import com.genspark.Exception.exception.DeveloperBannedException;
import com.genspark.Exception.exception.InvalidCategoryException;
import com.genspark.Exception.exception.PricingException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class AppValidator {
    private final Set<String> ALLOWED_CATEGORIES = Set.of("Games", "Utility", "Finance", "Enterprise");
    private final Set<String> BANNED_DEVELOPERS = Set.of("MaliciousDev", "SpammerInc");

    public void validateApps(App app)
            throws AppSizeTooLargeException, InvalidCategoryException, PricingException, DeveloperBannedException {
        if(app.getAppSize() > 500) {
            throw new AppSizeTooLargeException("App size is larger than 500MB");
        }

        if(ALLOWED_CATEGORIES.contains(app.getCategory())) {
            throw new InvalidCategoryException("Category " + app.getCategory() + " is not allowed");
        }

        if(!(Objects.equals(app.getCategory(), "Enterprise")) && app.getPrice() > 100) {
            throw new PricingException("Non enterprise App price must be less than 100");
        }

        if(app.getPrice() < 0) {
            throw new PricingException("App price cannot be negative");
        }

        if(BANNED_DEVELOPERS.contains(app.getDeveloperName())) {
            throw new DeveloperBannedException("Developer is banned from submitting apps");
        }
    }
}
