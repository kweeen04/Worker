package repository;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import dataAccess.WorkerDao;
import java.util.Hashtable;
import java.util.List;
import model.SalaryHistory;
import model.Worker;

public class WorkerRepository implements IWorkerRepository {

    @Override
    public void addWorker(Hashtable<String, Worker> workers) {
        WorkerDao.Instance().addWorker(workers);
    }

    @Override
    public void changeSalary(Hashtable<String, Worker> workers, List<SalaryHistory> salaryHistorys, String status) {
        WorkerDao.Instance().changeSalary(workers, salaryHistorys, status);
    }

    @Override
    public void displaySalary(List<SalaryHistory> salaryHistorys) {
        WorkerDao.Instance().displayInfomationSalary(salaryHistorys);
    } 
}