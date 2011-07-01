org.zkoss.addon.absolutelayout.Absolutelayout = zk.$extends(_zkf = zul.Widget, {
	bind_: function () {
		this.$supers(org.zkoss.addon.absolutelayout.Absolutelayout,'bind_', arguments);
		//this.domListen_(this.$n("cave"), "onClick", "_doItemsClick");
	},

	unbind_: function () {

		// A example for domUnlisten_ , should be paired with bind_
		// this.domUnlisten_(this.$n("cave"), "onClick", "_doItemsClick");
		this.$supers(org.zkoss.addon.absolutelayout.Absolutelayout,'unbind_', arguments);
	},

	getZclass: function () {
		return this._zclass != null ? this._zclass: "z-absolutelayout";
	}
});
