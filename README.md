# prjdec2025
springprjdec2025


``` @GetMapping("/isOnboarded/email/{email:.+}")
    public boolean isEmployeeOnboarded(
            @PathVariable String email,
            @RequestParam(value = "empId", required = false) Long empId) {
                    //here required parameter must be explicitly mentioned false else with always expect
                    // empId must be Long(not long) as it expect a wrapper class
        return employeeService.isOnboarded(empId, email);
    }
```