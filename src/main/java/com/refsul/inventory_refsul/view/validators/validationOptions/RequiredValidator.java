package com.refsul.inventory_refsul.view.validators.validationOptions;

public class RequiredValidator extends Validator
{
    protected String message = "El campo %s es requerido";

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
        return ( value != null && value.length() > 0 );
    }
}