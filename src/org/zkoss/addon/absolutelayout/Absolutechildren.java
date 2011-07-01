/**
 * 
 */
package org.zkoss.addon.absolutelayout;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zul.impl.XulElement;

/**
 * @author Ashish
 * 
 */
public class Absolutechildren extends XulElement {

	private int _X;
	private int _Y;

	public void setX(int x) {
		if (this._X != x) {
			this._X = x;
			smartUpdate("x", this._X);
		}
	}

	public void setY(int y) {
		if (this._Y != y) {
			this._Y = y;
			smartUpdate("y", this._Y);
		}
	}

	protected void renderProperties(org.zkoss.zk.ui.sys.ContentRenderer renderer)
			throws java.io.IOException {
		super.renderProperties(renderer);

		render(renderer, "x", this._X);
		render(renderer, "y", this._Y);
	}

	public int getX() {
		return this._X;
	}

	public int getY() {
		return this._Y;
	}

	public void beforeParentChanged(Component parent) {
		if (parent != null && !(parent instanceof Absolutelayout))
			throw new UiException("Wrong parent: " + parent);
		super.beforeParentChanged(parent);
	}
	
	public String getZclass() {
		return (this._zclass != null ? this._zclass : "z-absolutechildren");
	}

}