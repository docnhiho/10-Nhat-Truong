//1. Tính tổng của hai số.
const exe1 = (req, res) => {
    const { a, b } = req.query;
    let a1 = parseInt(a);
    let b1 = parseInt(b);
    res.send(`${a1 + b1}`)
}

//2. Kiểm tra một số có phải là số nguyên tố hay không.
const exe2 = (req, res) => {
    const { a } = req.query;
    var a1 = parseInt(a);
    var flag = true;
    if (a1 < 2) {
        flag = false;
    } else {
        // lặp từ 2 tới n-1
        for (var i = 2; i < a1 - 1; i++) {
            if (a1 % i == 0) {
                flag = false;
                break;
            }
        }
    }
    if (flag == true) {
        res.send(`${a1}` + " là số nguyên tố");
    }
    else {
        res.send(`${a1}` + " không là số nguyên tố");
    };
}


//3. Tìm số lớn nhất trong một mảng
const exe3 = (req, res) => {
    const arr = req.query
    const arr1 = Object.values(arr);
    var maxInNumbers = Math.max.apply(Math, arr1);
    res.send(`${maxInNumbers}`)
}

//4. Đảo ngược một chuỗi.
const exe4 = (req, res) => {
    const { a } = req.query;
    var string = '';
    for (var i = a.length - 1; i >= 0; i--)
        string += a[i];
    res.send(string);
}

//5. Kiểm tra một chuỗi có phải là chuỗi palindrome hay không
const exe5 = (req, res) => {
    const { chuoi } = req.query;
    let kyTu;
    for (var i = 0; i < chuoi.length; i++) {
        kyTu = chuoi.charAt(chuoi.length - i - 1);
        if (chuoi.charAt(i) == kyTu) {
            res.send("Chuỗi này là chuỗi Panlyndrome.");
            break;
        } else {
            res.send("Chuỗi này không là chuỗi Panlyndrome.");
            break;
        }
    }

}

//6. Đếm số lần xuất hiện của một ký tự trong một chuỗi.
const exe6 = (req, res) => {
    const {str,sub} = req.query;
    res.send(`${str.split(sub).length - 1}`);

}

//7. Tạo một chuỗi ngẫu nhiên với độ dài cho trước.
const exe7 = (req, res) => {
    const {str} = req.query
}

//17. Viết một hàm đảo ngược thứ tự các từ trong một chuỗi.
const exe17 = (req, res) => {
    const { str } = req.query;
    const a = str.split(' ').reverse().join(' ');
    // const b = a.reverse();
    // const c = b.join(' ');
    res.send(a)

    //cách 2
    // const { a } = req.query;
    // const str = a.split(' ')
    // var string = '';
    // for (var i = str.length - 1; i >= 0; i--)
    //     string += str[i];
    // res.send(string);

}


module.exports = {
    exe1,
    exe2,
    exe3,
    exe4,
    exe5,
    exe6,
    exe17
}
