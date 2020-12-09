package homepage.dao;

import homepage.entity.HomepageUserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomepageUserCourseDao extends JpaRepository<HomepageUserCourseDao, Long> {

    List<HomepageUserCourse> findAllByUserId(Long userId);
}