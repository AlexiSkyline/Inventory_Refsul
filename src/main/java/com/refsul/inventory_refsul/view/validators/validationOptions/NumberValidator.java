package com.refsul.inventory_refsul.view.validators.validationOptions;

public class NumberValidator extends Validator
{
    protected String message = "El campo %s debe ser un número valido";
    private final static String NUMBER_REGEX = "[+-]?\\d*(\\.\\d+)?";

    @Override
    public String getMessage()
    {
        return this.message;
    }

    @Override
    public void setMessage( String message )
    {
        this.message = message;
    }

    @Override
    public boolean isValid( String value )
    {
        return value.matches( NUMBER_REGEX );
    }
}