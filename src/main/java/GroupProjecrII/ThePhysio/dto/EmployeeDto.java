package GroupProjecrII.ThePhysio.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {


        private long id;
        private String firstname;
        private String lastname;
        private String email;
}
