package com.refsul.inventory_refsul.view.validators.validationOptions;

public class EmailValidator extends Validator
{
    protected String message = "El formato del %s es inválido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
        return value.matches( this.EMAIL_REGEX );
    }
}