package org.vaadin.simpleshop.ui.views;

import org.vaadin.simpleshop.lang.SystemMsg;
import org.vaadin.simpleshop.ui.components.InformationView;
import org.vaadin.simpleshop.ui.components.ItemBrowser;

import com.vaadin.ui.HorizontalLayout;

/**
 * Main view for the shop. Consists of the item browser and the information view
 * (containing the shopping cart content).
 * 
 * @author Kim
 * 
 */
public class ShopView extends View<HorizontalLayout> {

    private static final long serialVersionUID = 5345221919713457136L;

    private final InformationView cart;

    private final ItemBrowser browser;

    public ShopView() {
        super(new HorizontalLayout());
        mainLayout.setSizeFull();
        // Set the caption for this view. The caption is used as the caption in
        // the tabsheet for this tab.
        setCaption(SystemMsg.SHOP_CAPTION.get());
        browser = new ItemBrowser();
        cart = new InformationView();

        mainLayout.addComponent(browser);
        mainLayout.addComponent(cart);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void activated(Object... params) {
        // TODO Auto-generated method stub

    }

}