package com.refsul.inventory_refsul.view.validators.validationOptions;

abstract public class Validator
{
    protected String message;
    abstract public String getMessage();
    abstract public void setMessage( String message );
    abstract public boolean isValid( String value );
}