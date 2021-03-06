export function formatCurrency(amount, full) {
    if (typeof amount !== "number" || isNaN(amount)) {
        return "-";
    }

    if (full) {
        return amount.toLocaleString("vi", {
            style: 'currency',
            currency: 'VND'
        });
    } else {
        return (amount / 1000).toLocaleString("vi", {
            maximumFractionDigits: 1
        }) + "K";
    }
}

export function formatAmount(amount) {
    if (typeof amount !== "number" || isNaN(amount)) {
        return "-";
    }
    return amount.toLocaleString("vi");
}

export function formatPercent(amount) {
    if (typeof amount !== "number" || isNaN(amount)) {
        return "-";
    }
    return amount.toLocaleString("vi", {style: "percent", maximumFractionDigits: 2});
}

export function dealStatusName(status) {
    var map = {
        "BUYING:PendingNew": "Chờ mua",
        "BUYING:PartialFilled": "Đang mua",
        "BUYING:Filled": "Đã mua",
        "SELLING:PendingNew": "Chờ bán",
        "SELLING:PartialFilled": "Đang bán",
        "SELLING:Filled": "Đã bán",
    };

    if (status in map) {
      return map[status];
    } else {
      return "Không rõ"
    }
}
