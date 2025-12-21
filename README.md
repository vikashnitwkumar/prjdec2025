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

#Step to map the request parameter#
``` GET /products-by-category?categoryid={catId}```
```
@GetMapping("/products-by-category")
public List<AmazonProduct> getAmazonProductByCategory(
        @RequestParam("categoryid") String catgory) {

    return amazonProductService.getProductByCategoryId(categoryid);
} 
```