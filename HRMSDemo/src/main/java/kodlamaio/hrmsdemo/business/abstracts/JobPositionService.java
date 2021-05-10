package kodlamaio.hrmsdemo.business.abstracts;

import kodlamaio.hrmsdemo.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
}
