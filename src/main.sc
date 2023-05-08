require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello
        a: Привет, рад тебя видеть!

    state: Weather
        intent!: /weather
        a: Погода сегодня {{weather.today}}
            
    
    state: Currency
        intent!: /currency
        a: Курс валют сегодня {{currency.rate}}

    state: NoMatch
        intent!: /NoMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}