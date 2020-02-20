package com.cy.pj.hashtable;

class a{
	public a(Integer id) {
		
	}
}
//父类只有有参的构造方法，则子类默认上没有无参的构造方法
//因为会默认自动调用父类的无参构造方法，但父类并没有
public class ExtendsAndSuper extends a{
	
	public ExtendsAndSuper(Integer id) {
		
		super(id);
	}
}
