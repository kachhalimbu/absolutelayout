package org.zkoss.addon.absolutelayout;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zul.impl.XulElement;

/**
 * <p>A container component that can contain any other ZK component and can only 
 * be contained as direct child of Absolutelayout component. It can be absolutely positioned within 
 * Absolutelayout component by either setting "x" and "y" attribute or calling {@link #setX(int)} and {@link #setY(int)} 
 * methods.
 * 
 * <p>Default {@link #getZclass}: z-absolutechildren.
 * 
 * @author ashish
 * @since 0.8.0
 */
public class Absolutechildren extends XulElement {

	private int _X;
	private int _Y;

	/**
	 * <p>sets current "x" position within parent container component.If negative 0 is assumed.
	 * <p>Default: 0
	 * @param x int
	 */
	public void setX(int x) {
		if (x < 0) x = 0;
		if (this._X != x) {
			this._X = x;
			smartUpdate("x", this._X);
		}
	}

	/**
	 * sets current "y" position within parent container component. If negative 0 is assumed.
	 * <p>Default: 0
	 * @param y int
	 */
	public void setY(int y) {
		if (y < 0) y = 0;
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

	/**
	 * return current "x" position within parent container component
	 * @return int
	 */
	public int getX() {
		return this._X;
	}

	/**
	 * returns current "y" position within parent container component
	 * @return
	 */
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