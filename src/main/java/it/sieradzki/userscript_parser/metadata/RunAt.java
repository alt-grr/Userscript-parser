package it.sieradzki.userscript_parser.metadata;

public enum RunAt {

	DOCUMENT_START("document-start"),
	DOCUMENT_END("document-end");

	private final String name;

	private RunAt(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
