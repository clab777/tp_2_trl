import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestLibrary.class, test_book.class, test_fine.class, test_student.class, test_teacher.class})
public class AllTests {

}
