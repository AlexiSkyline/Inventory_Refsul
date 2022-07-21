package com.refsul.inventory_refsul.view.validators.validationOptions;

import com.refsul.inventory_refsul.view.validators.validationOptions.message.FormatMessage;

public class LengthValidator extends Validator implements FormatMessage
{
    protected String message = "El campo %s debe tener mínimo %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LengthValidator()
    {}

    public LengthValidator( int min, int max )
    {
        this.min = min;
        this.max = max;
    }

    public int getMin()
    {
        return min;
    }

    public void setMin( int min )
    {
        this.min = min;
    }

    public int getMax()
    {
        return max;
    }

    public void setMax( int max )
    {
        this.max = max;
    }

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
        if( value == null ) {
            return true;
        }
        int length = value.length();

        return ( length >= this.min && length <= this.max );
    }

    @Override
    public String getFormatMessage( String field )
    {
        return String.format( this.message, field, this.min, this.max );
    }
}