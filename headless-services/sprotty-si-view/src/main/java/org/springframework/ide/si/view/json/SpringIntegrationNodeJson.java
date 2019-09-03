package org.springframework.ide.si.view.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class SpringIntegrationNodeJson extends PrettyJson {

	private int nodeId;
	private String name;
	private JsonElement stats;
	private String componentType;
	private JsonObject properties;
	
	public int getNodeId() {
		return nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JsonElement getStats() {
		return stats;
	}
	public void setStats(JsonObject stats) {
		this.stats = stats;
	}
	public String getComponentType() {
		return componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}
	public JsonObject getProperties() {
		return properties;
	}
	public void setProperties(JsonObject properties) {
		this.properties = properties;
	}
}