/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

public interface IEntityRepistory<T extends IEntity> {
    void add(T Entity);
    void delete(T Entity);
    void update(T Entity);
    
}
