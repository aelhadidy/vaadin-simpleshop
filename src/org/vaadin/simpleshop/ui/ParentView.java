package org.vaadin.simpleshop.ui;

import org.vaadin.simpleshop.ui.views.View;

/**
 * Interface which all views who has child views needs to implement.
 * 
 * @author Kim
 * 
 */
public interface ParentView {

    /**
     * Activates the given view.
     * 
     * @param view
     */
    public void activate(View<?> view);

}
