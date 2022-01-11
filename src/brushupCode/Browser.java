package brushupCode;

public class Browser {
	
	public String name;
	public double version;
	private String plugin;
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkOsComatible();
	}

	private void checkOsComatible() {
		System.out.println("check os compactable");
		checkBrowserExecutable();
	}
	
	private void checkBrowserExecutable() {
		System.out.println("Browser executable");
		browserVersionCheck();
	}
	
	private void browserVersionCheck() {
		System.out.println("Browser version check");
	}
	
	public void setPlugin(String plugin) {
		this.plugin=plugin;
		
	}
	
	public String getPlugin() {
		return plugin;
	}
}
