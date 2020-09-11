let politicsstatus = [
    {"id":1 , "name": "中共党员"},
    {"id":2 , "name": "中共预备党员"},
    {"id":3 , "name": "共青团员"},
    {"id":4 , "name": "民革党员"},
    {"id":5 , "name": "民盟盟员"},
    {"id":6 , "name": "民建会员"},
    {"id":7 , "name": "民进会员"},
    {"id":8 , "name": "农工党党员"},
    {"id":9 , "name": "致公党党员"},
    {"id":10 , "name": "九三学社社员"},
    {"id":11 , "name": "台盟盟员"},
    {"id":12 , "name": "无党派民主人士"},
    {"id":13 , "name": "普通公民"}
]


let dept = [
    {"id":1 , "name": "股东会"},
    {"id":4 , "name": "董事会"},
    {"id":5 , "name": "总办"},
    {"id":78 , "name": "市场部"},
    {"id":81 , "name": "华北市场部"},
    {"id":82 , "name": "华南市场部"},
    {"id":85 , "name": "石家庄市场部"},
    {"id":86 , "name": "西北市场部"},
    {"id":87, "name": "西安市场"},
    {"id":89 , "name": "莲湖区市场"},
    {"id":91, "name": "技术部"},
    {"id":92 , "name": "运维部"}
]

let position = [
    {"id":29 , "name": "技术总监"},
    {"id":30 , "name": "运营总监"},
    {"id":31 , "name": "市场总监"},
    {"id":33 , "name": "研发工程师"},
    {"id":34 , "name": "运维工程师"},
    {"id":36 , "name": "Java研发经理"}
]

let nation = [
    {"id":1 , "name": "汉族"},
    {"id":2 , "name": "蒙古族"},
    {"id":3 , "name": "回族"},
    {"id":4 , "name": "藏族"},
    {"id":5 , "name": "维吾尔族"},
    {"id":6 , "name": "苗族"}
]

let joblevel = [
    {"id":9 , "name": "教授"},
    {"id":10, "name": "副教授"},
    {"id":12, "name": "助教"},
    {"id":13 , "name": "讲师"},
    {"id":14, "name": "初级工程师"},
    {"id":15, "name": "中级工程师"},
    {"id":16, "name": "高级工程师"},
    {"id":17, "name": "骨灰级工程师"}
]

let data = new Map()
data.set('dept' , dept)
data.set('posid', position)
data.set('politic' , politicsstatus)
data.set('nation' , nation)
data.set('joblevel' , joblevel)

function eachSelectData(array  , defaultOption ){
    for(let i=0; i< array.length; i++){
        let selectData  = data.get(array[i])
        let selectObject = document.querySelector('#'+ array[i])
        selectObject.innerHTML = ''
        let html = ''

        if(defaultOption) {
            html = '<option value="0">请选择'+ document.querySelector('#'+ array[i]).title +'</option>'
        }

        for(let j=0; j< selectData.length; j++){
            html+= `<option value="${selectData[j].id}">${selectData[j].name}</option>`
        }
        selectObject.innerHTML = html
    }
}