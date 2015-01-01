package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class WeeklyReport extends Model {
	public static final Finder<Long, WeeklyReport> find = new Finder<Long, WeeklyReport>(
			Long.class, WeeklyReport.class);

	@Id
	public Integer id;

	public String childName;
	public Integer percentage;


	public static List<WeeklyReport> findAll() {
		return find.all();
	}
	public static WeeklyReport findById(Integer enquiryId) {
		return find.where().eq("id",enquiryId).findUnique();
	}
}