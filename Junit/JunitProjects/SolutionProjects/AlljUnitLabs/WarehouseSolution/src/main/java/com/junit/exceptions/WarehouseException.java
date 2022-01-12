package com.junit.exceptions;

/*
 * Class is not used by solution, but exists to illustrate appropriate custom exception
 */
public class WarehouseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public WarehouseException() {
		super();
	}

	protected WarehouseException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public WarehouseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public WarehouseException(String arg0) {
		super(arg0);
	}

	public WarehouseException(Throwable arg0) {
		super(arg0);
	}

}
