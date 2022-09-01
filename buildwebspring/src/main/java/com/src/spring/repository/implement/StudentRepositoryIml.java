package com.src.spring.repository.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.src.spring.model.Student;
import com.src.spring.repository.StudentRepository;

public class StudentRepositoryIml implements StudentRepository {

    private Connection conn;
    private String sql;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public StudentRepositoryIml() {
       
    }

    @Override
    public boolean insertStudent(Student student) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteStudent(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.src.spring.repository.StudentRepository#findAllStudent()
     */
    @Override
    public ArrayList<Student> findAllStudent() {
        sql = "SELECT * FROM students";
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                students.add(
                        new Student(
                                resultSet.getLong("id"),
                                resultSet.getString("name"),
                                resultSet.getString("email"),
                                resultSet.getString("gender")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student findStudentById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
