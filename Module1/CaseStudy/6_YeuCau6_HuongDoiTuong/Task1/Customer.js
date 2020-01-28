class Customer {
    constructor(name, idCard, birthday, email, address, customerType, discount, amount, dateOfHire, serviceType, roomType) {
        this.name = name;
        this.idCard = idCard;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.discount = discount;
        this.amount = amount;
        this.dateOfHire = dateOfHire;
        this.serviceType = serviceType;
        this.roomType = roomType;
    }

    setName(name) {
        this.name = name;
    }
    getName() {
        return this.name;
    }

    setIdCard(idCard) {
        this.idCard = idCard;
    }
    getIdCard() {
        return this.idCard ;
    }

    setBirthday(birthday) {
        this.birthday = birthday;
    }
    getBirthday() {
        return this.birthday ;
    }

    setEmail(email) {
        this.email = email;
    }
    getEmail() {
        return this.email;
    }

    setAddress(address) {
        this.address = address;
    }
    getAddress() {
        return this.address;
    }

    setCustomerType(customerType) {
        this.customerType = customerType;
    }
    getCustomerType() {
        return this.customerType;
    }

    setDiscount(discount) {
        this.discount = discount;
    }
    getDiscount() {
        return this.discount;
    }

    setAmount(amount) {
        this.amount = amount;
    }
    getAmount() {
        return this.amount ;
    }

    setDateOfHire(dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
    getDateOfHire() {
        return this.dateOfHire;
    }

    setServiceType(serviceType) {
        this.serviceType = serviceType;
    }
    getServiceType() {
        return this.serviceType;
    }

    setRoomType(roomType) {
        this.roomType = roomType;
    }
    getRoomType() {
        return this.roomType ;
    }

    totalPay = () => {
        let moneyPerDays = 0;
        if(this.getServiceType() === 'Villa') {
            moneyPerDays = 500;
        } else if(this.getServiceType() === 'House') {
            moneyPerDays = 300;
        } else {
            moneyPerDays = 100;
        }
        let dateOfHire = Number.parseFloat(this.getDateOfHire());
        let discount = Number.parseFloat(this.getDiscount());
        return (moneyPerDays * dateOfHire * (1 - discount) / 100);
    }
}