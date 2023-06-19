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

const data = (req,res) => {
    res.send(database)
}
function getCountry(req, res) {
    const {country} = req.query;

    let children1 = database.children;
    children1.map((e) => {
        let children2 = e;

        children2.children.map((e) => {
            let children3 = e;
            children3.children = children3.children.map((e) => {

                return e.children.filter((el) => el.country.toLowerCase().startsWith(country));
            })
            children3.children = children3.children.filter((e) => e.length > 0);
            return children3;
        })
        return children2;
    })
    res.send(children1)
}

module.exports = {
    sendData,
    data,
    getCountry
}