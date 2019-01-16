import org.springframework.cloud.contract.spec.Contract

Contract.make {
    //ignored()
    description "should return one user success"
    request {
        method 'GET'
        urlPath'/user/1'
    }
    response {
        status 200
        body (
                '''{
    "id": 1,
    "childName": "小白",
    "parentName": "大白",
    "phone": "18880000"
}'''
        )
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
}