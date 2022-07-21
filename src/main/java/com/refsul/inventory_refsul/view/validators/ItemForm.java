package com.refsul.inventory_refsul.view.validators;

import com.refsul.inventory_refsul.view.validators.validationOptions.Validator;
import com.refsul.inventory_refsul.view.validators.validationOptions.message.FormatMessage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ItemForm
{
    protected String name;
    protected String value;

    private List<Validator> validators;
    private List<String> errors;

    public ItemForm()
    {
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ItemForm( String name, String value )
    {
        this();
        this.name = name;
        this.value = value;
    }

    public ItemForm addValidador( Validator validator )
    {
        this.validators.add( validator );
        return this;
    }

    public List<String> getErrors()
    {
        return this.errors;
    }

    public void cleanError()
    {
        this.errors.clear();
    }

    public boolean isValid()
    {
        for( Validator validator: this.validators )
        {
            if( !validator.isValid( this.value ) ) {
                if( validator instanceof FormatMessage ) {
                    this.errors.add( ((FormatMessage) validator).getFormatMessage( this.name ) );
                } else {
                    this.errors.add( String.format( validator.getMessage(), this.name ) );
                }
            }
        }

        return this.errors.isEmpty();
    }

    public void printMessage()
    {
        JOptionPane.showMessageDialog( null, this.errors.get(0), "Error al ingresar la información",
                JOptionPane.WARNING_MESSAGE );
    }
}
