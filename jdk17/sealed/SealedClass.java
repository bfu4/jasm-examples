public sealed class SealedClass permits AllowedClass {

	protected final int identifier;

	public SealedClass(int identifier) {
		this.identifier = identifier;
	}

	public int getIdentifier() {
		return this.identifier;
	}
}
