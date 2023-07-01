const fs = require('fs');
// var database = fs.readFileSync('./src/data/output.json');
// var myObjects = JSON.parse(database);
const database = require('../data/output.json')
const sendData = (req, res) => {
    const dataChildren = req.body;
    
    // write to file named "output.json"
    fs.writeFile('./src/data/output.json', JSON.stringify(dataChildren), err => {
        if(err){
            console.log(err);
        }
    })
    res.send("success");
}

// function data(req,res){
// }
const data = (req,res) => {
    res.send(database)

}

module.exports = {
    sendData,
    data
}