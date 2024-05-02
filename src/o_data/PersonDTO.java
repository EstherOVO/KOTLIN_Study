package o_data;

import java.util.Objects;

// DTO 생성 시 IDE 활용을 통해 만들 수 있고
// lombok (공통되는 부분을 애노테이션으로 대체) 라이브러리 활용 가능
// 코드가 길어지거나 애노테이션을 통해 추가 처리(라이브러리 의존)
public class PersonDTO {

    private String name;
    private int age;

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonDTO() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) obj;
        return age == personDTO.age && Objects.equals(name, personDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
