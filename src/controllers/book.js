function getAllBooks(req,res){
    res.send([
        {name: 'Tieng chim hot', price: 20000},
        {name: 'Chiec thuyen ngoai xaa' ,price: 15000}
    ]);
};



module.exports ={ getAllBooks }