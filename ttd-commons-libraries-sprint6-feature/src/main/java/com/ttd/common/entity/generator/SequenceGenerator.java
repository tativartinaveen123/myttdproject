package com.ttd.common.entity.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.ttd.common.util.CommonUtility;
import com.ttd.eaccommodation.entity.AccomBooking;
import com.ttd.edarshan.entity.DarshanBooking;
import com.ttd.ehundi.entity.HundiOffering;
import com.ttd.eseva.entity.SevaBooking;
import com.ttd.kalyanaVedika.entity.PilgrimMarriageDtl;
import com.ttd.sgms.entity.SgmsBooking;

public class SequenceGenerator implements IdentifierGenerator {

	public Serializable generate(SessionImplementor session, Object object)
			throws HibernateException {
		StringBuffer prefix = new StringBuffer("I");
		String query = null;
		String location = "INT";
		String bookingId = null;

		if (object instanceof AccomBooking) {
			prefix.append("A").append(location);
			bookingId = "ACCOM_BOOKING_ID";
			query = "SELECT * FROM (SELECT ACCOM_BOOKING_ID FROM ACCOM_BOOKING where trunc(CREATED_TIME) = trunc(SYSDATE) ORDER BY CREATED_TIME DESC) WHERE ROWNUM = 1";
		} else if (object instanceof SevaBooking) {
			prefix.append("S").append(location);
			bookingId = "SEVA_BOOKING_ID";
			query = "SELECT * FROM (SELECT SEVA_BOOKING_ID FROM SEVA_BOOKING where trunc(CREATED_TIME) = trunc(SYSDATE) ORDER BY CREATED_TIME DESC) WHERE ROWNUM = 1";
		} else if (object instanceof DarshanBooking) {
			prefix.append("D").append(location);
			bookingId = "DARSHAN_BOOKING_ID";
			query = "SELECT * FROM (SELECT DARSHAN_BOOKING_ID FROM DARSHAN_BOOKING where trunc(CREATED_TIME) = trunc(SYSDATE) ORDER BY CREATED_TIME DESC) WHERE ROWNUM = 1";
		} else if (object instanceof SgmsBooking) {
			prefix.append("M").append(location);
			bookingId = "SGMS_BOOKING_ID";
			query = "SELECT * FROM (SELECT SGMS_BOOKING_ID FROM SGMS_BOOKING where trunc(CREATED_TIME) = trunc(SYSDATE) ORDER BY CREATED_TIME DESC) WHERE ROWNUM = 1";
		} else if (object instanceof PilgrimMarriageDtl) {
			prefix.append("K").append(location);
			bookingId = "KVBOOKING_ID";
			query = "SELECT * FROM (SELECT KVBOOKING_ID FROM PILGRIM_MARRIAGE_DTLS where trunc(CREATED_TIME) = trunc(SYSDATE) ORDER BY CREATED_TIME DESC) WHERE ROWNUM = 1";
		} else if (object instanceof HundiOffering) {
			prefix.append("H").append(location);
			bookingId = "OFFERING_ID";
			query = "SELECT * FROM (SELECT OFFERING_ID FROM HUNDI_OFFERINGS where trunc(CREATED_TIME) = trunc(SYSDATE) ORDER BY CREATED_TIME DESC) WHERE ROWNUM = 1";
		}
		Date date = new Date();
		String dateStr = CommonUtility.DatePlusUUIDForDonation(date);
		prefix.append(dateStr);
		Connection connection = session.connection();

		int id = 1;
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String objId = rs.getString(bookingId);
				if (objId.startsWith(prefix.toString().substring(0, 5))) {
					// IAINT ddMMyy 00001
					 id = Integer.parseInt(objId.substring(11)) + 1;
					
				} else {
					 id = 1;
				}
			} else {
				 id = 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prefix.append(String.format("%05d", id)).toString();
	}

}