/**
 * JPA Annotaion OneToOne 에 대한 테스트 코드
 * OneToOne 은 단방향 및 양방향으로 사용할 수 있는데
 * 양방향으로 설정할 경우 한쪽을 수정하면 다른쪽도 같이 수정된다는 원리
 * 지금 코드는 OneToOneAddress 코드와 관계를 맺고 있으며
 * OneToOneStudent 에서 Address 와의 관계 설정을 해놓음.
 */

package com.sol.eyeq.model.domain.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity
public class OneToOneStudent {
	@TableGenerator(name = "Emp_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Emp_Gen")
	private int id;

	private String name;

	@OneToOne
	private OneToOneAddress address;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OneToOneAddress getAddress() {
		return address;
	}

	public void setAddress(OneToOneAddress address) {
		this.address = address;
	}

	public String toString() {
		return "\n\nID:" + id + "\nName:" + name + "\n\n";
	}
}
