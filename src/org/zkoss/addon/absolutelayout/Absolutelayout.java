package org.zkoss.addon.absolutelayout;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zul.impl.XulElement;

/**
 * <p>An Absolutelayout component can contain absolute positioned multiple
 * absolutechildren components.
 * 
 * <p>Default {@link #getZclass}: z-absolutelayout.
 * 
 * @author ashish
 * @since 0.8.0
 */
public class Absolutelayout extends XulElement {

	public void beforeChildAdded(Component child, Component refChild) {
		if (!(child instanceof Absolutechildren))
			throw new UiException("Unsupported child for Absolutelayout: "
					+ child);
		super.beforeChildAdded(child, refChild);
	}

	/**
	 * The default zclass is "z-absolutelayout"
	 */
	public String getZclass() {
		return (this._zclass != null ? this._zclass : "z-absolutelayout");
	}
}