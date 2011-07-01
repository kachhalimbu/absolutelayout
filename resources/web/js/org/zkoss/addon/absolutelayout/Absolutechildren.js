org.zkoss.addon.absolutelayout.Absolutechildren = zk.$extends(_zkf = zul.Widget, {
	getX: function(){
		return this._x ;
	},
    setX: function(v) {
    	if(!v) v = 0;
    	if(this._x != v) {
    		this._x = v;
			if(this.desktop){
				this._rePositionX();
			}
    	}
    },
	getY: function(){
    	return this._y ;
	},
	setY: function(v) {
		if(!v) v = 0;
		if(this._y != v) {
			this._y = v;
			if(this.desktop){
				this._rePositionY();
			}
		}
	},
	_rePositionBoth: function() {
		var a = jq(this.$n());
		a.css("left", this._x);
		a.css("top", this._y);
	},
	_rePositionX: function() {
		var a = jq(this.$n());
		a.css("left", this._x);
	},
	_rePositionY: function() {
		var a = jq(this.$n());
		a.css("top", this._y);
	},
	bind_: function () {
		this.$supers(org.zkoss.addon.absolutelayout.Absolutechildren,'bind_', arguments);
		this._rePositionBoth();
		//this.domListen_(this.$n("cave"), "onClick", "_doItemsClick");
	},

	unbind_: function () {

		// A example for domUnlisten_ , should be paired with bind_
		// this.domUnlisten_(this.$n("cave"), "onClick", "_doItemsClick");
		this.$supers(org.zkoss.addon.absolutelayout.Absolutechildren,'unbind_', arguments);
	},

	getZclass: function () {
		return this._zclass != null ? this._zclass: "z-absolutechildren";
	}
});
