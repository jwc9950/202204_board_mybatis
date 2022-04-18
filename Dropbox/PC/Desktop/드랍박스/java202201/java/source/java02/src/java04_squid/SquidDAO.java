package java04_squid;

import java.util.List;

public interface SquidDAO {
	//public abstract생략
	int insert(Squid squid);
	int update(Squid squid);
	int delete(int no);
	Squid selectOne(int no);
	List<Squid> selectList();
}
