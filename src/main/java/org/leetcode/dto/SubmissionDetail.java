package org.leetcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * SubmissionDetail
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubmissionDetail {
  private String status_code;
  private String lang;
  private boolean run_success;
  private String status_runtime;
  private int memory;
  private String display_runtime;
  private String question_id;
  private int elapsed_time;
  private String compare_result;
  private String code_output;
  private String std_output;
  private String last_testcase;
  private String expected_output;
  private String task_finish_time;
  private String task_name;
  private boolean finished;
  private String status_msg;
  private String state;
  private int judger_status_code;

  public String getStatus_code() {
    return status_code;
  }

  public void setStatus_code(String status_code) {
    this.status_code = status_code;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public boolean isRun_success() {
    return run_success;
  }

  public void setRun_success(boolean run_success) {
    this.run_success = run_success;
  }

  public String getStatus_runtime() {
    return status_runtime;
  }

  public void setStatus_runtime(String status_runtime) {
    this.status_runtime = status_runtime;
  }

  public int getMemory() {
    return memory;
  }

  public void setMemory(int memory) {
    this.memory = memory;
  }

  public String getDisplay_runtime() {
    return display_runtime;
  }

  public void setDisplay_runtime(String display_runtime) {
    this.display_runtime = display_runtime;
  }

  public String getQuestion_id() {
    return question_id;
  }

  public void setQuestion_id(String question_id) {
    this.question_id = question_id;
  }

  public int getElapsed_time() {
    return elapsed_time;
  }

  public void setElapsed_time(int elapsed_time) {
    this.elapsed_time = elapsed_time;
  }

  public String getCompare_result() {
    return compare_result;
  }

  public void setCompare_result(String compare_result) {
    this.compare_result = compare_result;
  }

  public String getCode_output() {
    return code_output;
  }

  public void setCode_output(String code_output) {
    this.code_output = code_output;
  }

  public String getStd_output() {
    return std_output;
  }

  public void setStd_output(String std_output) {
    this.std_output = std_output;
  }

  public String getLast_testcase() {
    return last_testcase;
  }

  public void setLast_testcase(String last_testcase) {
    this.last_testcase = last_testcase;
  }

  public String getExpected_output() {
    return expected_output;
  }

  public void setExpected_output(String expected_output) {
    this.expected_output = expected_output;
  }

  public String getTask_finish_time() {
    return task_finish_time;
  }

  public void setTask_finish_time(String task_finish_time) {
    this.task_finish_time = task_finish_time;
  }

  public String getTask_name() {
    return task_name;
  }

  public void setTask_name(String task_name) {
    this.task_name = task_name;
  }

  public boolean isFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  public String getStatus_msg() {
    return status_msg;
  }

  public void setStatus_msg(String status_msg) {
    this.status_msg = status_msg;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getJudger_status_code() {
    return judger_status_code;
  }

  public void setJudger_status_code(int judger_status_code) {
    this.judger_status_code = judger_status_code;
  }

}
