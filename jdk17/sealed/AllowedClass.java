public non-sealed class AllowedClass extends SealedClass {


	public AllowedClass() {
		super(10);
	}

	public native SealedClass asSealedInst();

}
