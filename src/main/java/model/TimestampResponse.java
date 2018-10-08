package model;

import java.io.Serializable;
import java.util.Date;

// This is the class you need to represent a timestamp
public class TimestampResponse implements Serializable {
	private static final long serialVersionUID = 5002248641449223250L;
	private long timestamp;

	public TimestampResponse() {
		this.timestamp = new Date().getTime();
	}

	public long getTimestamp() {
		return timestamp;
	}

}
