/**
 * 
 */
package org.zkoss.addon.test;

import org.zkoss.addon.absolutelayout.Absolutechildren;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 * @author Ashish
 *
 */
public class AbsolutelayoutDemoCtrl extends GenericForwardComposer {

	private Window testWindow;
	
	private Absolutechildren abChild3; 
	private Absolutechildren abChild2; 
	private Absolutechildren abChild1; 
	private Absolutechildren abChildPanel;
	private Panel panel1;
	private Panel panel2;
	private Panel panel3;
	private Panel panel4;
	private Textbox abChild1Win$xTxt;
	private Textbox abChild1Win$yTxt;
	private Button abChild3Win$detach;
	private Button abChild1Win$update;
	private Button detachPanel1;
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		abChild3Win$detach.addEventListener(Events.ON_CLICK, new EventListener(){

			public void onEvent(Event event) throws Exception {
				abChild3.detach();
			}
			
		});
		abChild1Win$update.addEventListener(Events.ON_CLICK, new EventListener(){
			public void onEvent(Event event) throws Exception {
				abChild1.setX(Integer.parseInt(abChild1Win$xTxt.getValue()));
				abChild1.setY(Integer.parseInt(abChild1Win$yTxt.getValue()));
			}
		});
	}
	public void onClick$detachPanel1() {
		panel1.detach();
	}
	public void onClick$detachPanel2() {
		panel2.detach();
	}
	public void onClick$detachPanel3() {
		panel3.detach();
	}
	public void onClick$detachPanel4() {
		panel4.detach();
	}
}
