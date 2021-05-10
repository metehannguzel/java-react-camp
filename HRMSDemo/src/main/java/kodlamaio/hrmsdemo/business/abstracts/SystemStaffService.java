package kodlamaio.hrmsdemo.business.abstracts;

import kodlamaio.hrmsdemo.entities.concretes.SystemStaff;

import java.util.List;

public interface SystemStaffService {
    List<SystemStaff> getAll();
}
