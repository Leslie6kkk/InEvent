package jessie.leslie.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserRes{
    public boolean AlreadyRegistered;
    public boolean Verified;
    public boolean Success;
}