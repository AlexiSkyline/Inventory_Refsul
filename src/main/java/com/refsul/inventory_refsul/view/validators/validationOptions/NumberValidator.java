package com.refsul.inventory_refsul.view.validators.validationOptions;

public class NumberValidator extends Validator
{
    protected String message = "El campo %s debe ser un número";

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
        try {
            Integer.parseInt( value );
            return true;
        } catch ( NumberFormatException e ) {
            return false;
        }
    }
}